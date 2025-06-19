package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtility {
    //pathul unde voi salva fisierie de logurile
    private static final String suiteLogPath = "target/logs/suite/";

    // patul unde voi genre fisierul mare cu toate logurile
    private static final String regressionLogsPath = "target/logs/";


    private static final Logger logger = LogManager.getLogger();

    // vreau sa fac o metoda care ma asigura ca porneste un test

    public static synchronized void startTestcase(String testName){
        logger.info("==============Execution strated: " + testName + "====================");
    }

    // metodat care se asigura ca sa terminat un test

    public static synchronized  void addTestCase(String testName){
        logger.info("==============Execution finish : " + testName + "====================");
    }

    // metoda care se asigura ca adauga un entry ca si log

    public static synchronized void infoLog(String message){
        logger.info(Thread.currentThread().getName() + ":" + getCallInfo() + message);
    }
    // ca logheaza o erroare
    public static synchronized void errorLog(String message){
        logger.error(Thread.currentThread().getName() + ":" + getCallInfo() + message);
    }
    // metoda care sa scoate informatii despre executia curenta
    private static synchronized  String getCallInfo(){
       String className=Thread.currentThread().getStackTrace()[2].getClassName();
       String methodName=Thread.currentThread().getStackTrace()[2].getMethodName();
       return className + ", " + methodName + "==>";
    }
    // metoda care ea toate logurile si le pune intr-un singur fisier
}
;