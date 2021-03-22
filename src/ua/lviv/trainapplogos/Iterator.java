package ua.lviv.trainapplogos;

public interface Iterator {
	public boolean hasNext();
	public Object next();
}

class CollectionMod {
	private static Object[] arr;
	
	CollectionMod (Object[] arr) {
		CollectionMod.arr = arr;
	}
	
	public class Forward implements Iterator {
		private int ind = 0;
		
		@Override
		public boolean hasNext() {
			return ind < arr.length;
		}

		@Override
		public Object next() {
			if (ind % 2 != 0) arr[ind] = 0;
			return arr[ind++];
		}
	}
	//return object of createForward
	public Forward createForward() {
		return new Forward();
	}
	
	
	public class Backward implements Iterator {
		int ind = arr.length - 1;
		
		@Override
		public boolean hasNext() {
			return ind > 0;
		}

		@Override
		public Object next() {
			if ((ind % 2) != ((arr.length - 1) % 2)) ind--;
			return arr[ind--];
		}
	}
	
	//return object of createBackward
	public Backward createBackward() {
		return new Backward();
	}
	
	
	
	public Iterator createBackwardOver2() {
		
		return new Iterator() {
			int ind = arr.length - 1;
			
			@Override
			public boolean hasNext() {
				return ind - 3 >= -3;
			}

			@Override
			public Object next() {
				Object res = arr[ind];
				if ((ind - 3) >= 0) { ind -= 3; } else { ind = -100; }
				return res; 
			}
		};
	} 
	
	public Iterator createForwardOver4() {
		class ForwardOver4 implements Iterator {
			int ind = 0;
			
			@Override
			public boolean hasNext() {
				return ind <= arr.length - 1;
			}

			@Override
			public Object next() {
				Object res = arr[ind];
				if ((ind + 5) <= arr.length - 1) { ind += 5; } else { ind =  arr.length + 10; }
				return res; 
			}
		}
		return new ForwardOver4();
	}
	
	private static class ForwardOver2 implements Iterator {
		int ind = 0;
		
		@Override
		public boolean hasNext() {
			return ind <= arr.length - 1;
		}

		@Override
		public Object next() {
			Object res = arr[ind];
			if ((ind + 1) <= arr.length - 1) { ind += 2; } else { ind =  arr.length + 10; }
			return res; 
		}
	}
	
	public static ForwardOver2 createForwardOver2() {
		return new ForwardOver2();
	}
	
}