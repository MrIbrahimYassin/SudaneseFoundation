package paresoneal;

import java.util.ArrayList;

public interface IManagePersone<T> {
	public T getSingle(int id,ArrayList<T> t); 
	public ArrayList<T> getAll(ArrayList<T> t); 
	public boolean add(T t,ArrayList<T> t2); 
	public T edit(int id,T t,ArrayList<T> t2); 
	public boolean delete(T t,ArrayList<T> t2); 
	

}
