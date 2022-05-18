package co.com.checktask.project.jar.repositories;

import org.springframework.stereotype.Repository;

import co.com.checktask.project.jar.models.TaskModel;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface TaskRepositories extends CrudRepository<TaskModel, Long>{

	public abstract ArrayList<TaskModel> findByImportancia(Integer importancia);
}
