package fr.epita.textmining.services;

import java.util.List;
import javax.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public abstract class DatabaseDAO<T> {
	@Inject
	SessionFactory sf;
	
	public final void create(T entity) {
		if (!beforeCreate(entity)) {
			return;
		}

		final Session session = sf.openSession();
		session.saveOrUpdate(entity);

	}

	protected boolean beforeCreate(T entity) {
		return entity != null;
	}

	public final void update(T entity) {
		final Session session = sf.openSession();
		session.saveOrUpdate(entity);
	}

	public final void delete(T entity) {
		final Session session = sf.openSession();
		session.delete(entity);
	}

	public final List<T> search(T entity) {
		final Session session = sf.openSession();
		final Query searchQuery = session.createQuery("From"+entity.getClass().getName());
		return searchQuery.list();
	}



}
