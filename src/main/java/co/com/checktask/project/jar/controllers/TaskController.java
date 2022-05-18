package co.com.checktask.project.jar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.checktask.project.jar.models.TaskModel;
import co.com.checktask.project.jar.services.TaskServices;

	@RestController
	@RequestMapping("/task") //direccion del servidor donde se va a activar la clase
	public class TaskController {
		
		@Autowired
		TaskServices taskService;
		
		@GetMapping("/prueba")
		public ArrayList<TaskModel> obtenerTarea(){
			System.out.println("Lista prueba");
			return taskService.obtenerTarea();
		}
		
		
		@PostMapping("/create")
		public TaskModel guardarTarea(@RequestBody TaskModel tarea) {
			System.out.println("Tarea recibida");
			return this.taskService.guardarTarea(tarea);
		}
		
		
		@GetMapping(path = "/{id}")
		public Optional<TaskModel> obtenerTareaPorId(@PathVariable("id")Long id) {
			return this.taskService.obtenerPorId(id);
		}
		
		@GetMapping( path = "/query")
		public ArrayList<TaskModel> obtenerTareaPorPrioridad(@RequestParam("prioridad") Integer importancia){
			return this.taskService.obtenerPorPrioridad(importancia);
		}
		
		@DeleteMapping(path = "/{id}")
		public String eliminarPorId(@PathVariable("id") Long id) {
			boolean ok = this.taskService.eliminarTarea(id);
			if(ok) {
				return "Se elimino el usuario con id " + id;
			}else {
				return "No se pudo eliminar el usuario con id " + id;
			}
		}
		
}
