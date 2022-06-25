package ThreadPackage;

public class ThreadPriorities extends Thread{  
	 
	public void run(){  
	   System.out.println("Thread name: "+Thread.currentThread().getName());
	   System.out.println("Thread - "+Thread.currentThread().getName()+" - state: "+Thread.currentThread().getState());
	   System.out.println("Thread - "+Thread.currentThread().getName()+" - Deamon or not:"+Thread.currentThread().isDaemon());
	   System.out.println("Thread - "+Thread.currentThread().getName()+" - Alive:"+Thread.currentThread().isAlive());
	};
	
	 public static void main(String args[]){  
	  
	  ThreadPriorities thr1=new ThreadPriorities();  
	  ThreadPriorities thr2=new ThreadPriorities();  
	  ThreadPriorities thr3=new ThreadPriorities();
	  
	  thr1.setName("Thread-One");
	  thr2.setName("Thread-Two");
	  thr3.setName("Thread-Three");
	 
	  thr1.setPriority(Thread.MIN_PRIORITY);  
	  thr2.setPriority(Thread.MAX_PRIORITY);  
	  thr3.setPriority(Thread.NORM_PRIORITY); 
	  
	  thr2.setDaemon(true); 
	  
	  thr1.start();  
	  thr2.start();  
	  thr3.start();
	   
	 }  
	}     
