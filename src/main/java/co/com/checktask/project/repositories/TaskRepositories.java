package co.com.checktask.project.repositories;

import org.springframework.stereotype.Repository;
import co.com.checktask.project.models.TaskModel;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface TaskRepositories extends CrudRepository<TaskModel, Long>{

	public abstract ArrayList<TaskModel> findByPrioridad(Integer prioridad);
}
