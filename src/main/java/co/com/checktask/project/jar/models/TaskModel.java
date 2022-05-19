package co.com.checktask.project.jar.models;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Data;


//@Data
@Entity
@Table(name = "Task")
public class TaskModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	
	private String titulo;
	private String descripcion;
	private boolean estado;
	private int importancia;
	private LocalDateTime fecha;
	
	
	public TaskModel() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getImportancia() {
		return importancia;
	}
	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	@Override
	public String toString() {
		return "TaskModel [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", estado=" + estado
				+ ", importancia=" + importancia + ", fecha=" + fecha + "]";
	}
}
