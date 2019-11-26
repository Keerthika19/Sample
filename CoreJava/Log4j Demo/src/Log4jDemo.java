import org.apache.log4j.Logger;

public class Log4jDemo {
	
	final static Logger log =Logger.getLogger(Log4jDemo.class);
	
	void meth1(){
		log.debug("This is debug1 ");
		log.debug("This is debug 2");
		log.info("This is info ");
		log.warn("This is warning ");
		log.error("This is error ");
		log.fatal("This is fatal ");
	}
	
	public static void main(String args[]){
		Log4jDemo ld= new Log4jDemo();
		ld.meth1();
		System.out.println("Log entered");
	}

}
