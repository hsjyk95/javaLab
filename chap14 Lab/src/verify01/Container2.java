package verify01;

public class Container2<T, M> {
		private T name;
		private M job;
		
		public T getkey() {
			return this.name;
		}
		
		public M getvalue() {
			return this.job;
		}
		
		public void set(T name, M job) {
			this.name = name;
			this.job = job;
			
		}
	}


