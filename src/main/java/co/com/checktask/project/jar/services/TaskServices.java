package co.com.checktask.project.jar.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.checktask.project.jar.models.TaskModel;
import co.com.checktask.project.jar.repositories.TaskRepositories;

@Service
public class TaskServices {

	@Autowired
	TaskRepositories taskRepositories;
	
	
	// obtener objetos de tareas 
	public ArrayList<TaskModel> obtenerTarea(){
		return (ArrayList<TaskModel>) taskRepositories.findAll();
	}
	
	//guardar o registrar la tarea en la bd
	public TaskModel guardarTarea(TaskModel tarea) {
		return taskRepositories.save(tarea);
	}
	
	//buscar tarea por id
	public Optional<TaskModel> obtenerPorId(Long id){
		return taskRepositories.findById(id);
	}
	
	// buscar por prioridad
	public ArrayList<TaskModel> obtenerPorPrioridad(Integer importancia){
		return taskRepositories.findByImportancia(importancia);
	}
	
	//eliminar tarea pos id
	public boolean eliminarTarea(Long id) {
		try {
			taskRepositories.deleteById(id);
			return true;
		}catch (Exception err) {
			return false;
		}
	}
	
	
	// fechas
	
	
	
	
}
