package com.logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class ColorLogFactory {

    // Define your color codes
    private static final String RESET = "\033[0m";
    private static final String RED = "\033[31m";
    private static final String GREEN = "\033[32m";
    private static final String YELLOW = "\033[33m";
    private static final String BLUE = "\033[34m";
    private static final String MAGENTA = "\033[35m";
    private static final String CYAN = "\033[36m";
    private static final String WHITE = "\033[37m";



    public static Logger getLogger(Class<?> clazz) {
        return new ColorLogger(LoggerFactory.getLogger(clazz));
    }

    private static class ColorLogger implements Logger {

        private final Logger logger;

        public ColorLogger(Logger logger) {
            this.logger = logger;
        }

        // Override all the logging methods to print color logs
        public void trace(String  msg) {
            logger.trace(CYAN + msg + RESET);
        }

        public void debug(String msg) {
            logger.debug(MAGENTA + msg + RESET);
        }

        public void info(String msg) {
            logger.info(GREEN + msg + RESET);
        }

        public void warn(String msg) {
            logger.warn(YELLOW + msg + RESET);
        }

        public void error(String msg) {
            logger.error(RED + msg + RESET);
        }

        public void error(String msg, Throwable t) {
            logger.error(RED + msg + RESET, t);
        }

        public boolean isTraceEnabled() {
            return logger.isTraceEnabled();
        }

        public boolean isDebugEnabled() {
            return logger.isDebugEnabled();
        }

        public boolean isInfoEnabled() {
            return logger.isInfoEnabled();
        }

        public boolean isWarnEnabled() {
            return logger.isWarnEnabled();
        }

        public boolean isErrorEnabled() {
            return logger.isErrorEnabled();
        }

		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		public void trace(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		public void trace(String format, Object arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		public void trace(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		public void trace(String msg, Throwable t) {
			// TODO Auto-generated method stub
			
		}

		public boolean isTraceEnabled(Marker marker) {
			// TODO Auto-generated method stub
			return false;
		}

		public void trace(Marker marker, String msg) {
			// TODO Auto-generated method stub
			
		}

		public void trace(Marker marker, String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		public void trace(Marker marker, String format, Object arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		public void trace(Marker marker, String format, Object... argArray) {
			// TODO Auto-generated method stub
			
		}

		public void trace(Marker marker, String msg, Throwable t) {
			// TODO Auto-generated method stub
			
		}

		public void debug(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		public void debug(String format, Object arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		public void debug(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		public void debug(String msg, Throwable t) {

			
		}

		public boolean isDebugEnabled(Marker marker) {
			return true;
		}

		public void debug(Marker marker, String msg) {
			
		}

		public void debug(Marker marker, String format, Object arg) {
			
		}

		public void debug(Marker marker, String format, Object arg1, Object arg2) {
		
			
		}

		public void debug(Marker marker, String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		public void debug(Marker marker, String msg, Throwable t) {
			// TODO Auto-generated method stub
			
		}

		public void info(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		public void info(String format, Object arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		public void info(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		public void info(String msg, Throwable t) {
			// TODO Auto-generated method stub
			
		}

		public boolean isInfoEnabled(Marker marker) {
			// TODO Auto-generated method stub
			return false;
		}

		public void info(Marker marker, String msg) {
			// TODO Auto-generated method stub
			
		}

		public void info(Marker marker, String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		public void info(Marker marker, String format, Object arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		public void info(Marker marker, String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		public void info(Marker marker, String msg, Throwable t) {
			// TODO Auto-generated method stub
			
		}

		public void warn(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		public void warn(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		public void warn(String format, Object arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		public void warn(String msg, Throwable t) {
			// TODO Auto-generated method stub
			
		}

		public boolean isWarnEnabled(Marker marker) {
			// TODO Auto-generated method stub
			return false;
		}

		public void warn(Marker marker, String msg) {
			// TODO Auto-generated method stub
			
		}

		public void warn(Marker marker, String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		public void warn(Marker marker, String format, Object arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		public void warn(Marker marker, String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		public void warn(Marker marker, String msg, Throwable t) {
			// TODO Auto-generated method stub
			
		}

		public void error(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		public void error(String format, Object arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		public void error(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		public boolean isErrorEnabled(Marker marker) {
			// TODO Auto-generated method stub
			return false;
		}

		public void error(Marker marker, String msg) {
			// TODO Auto-generated method stub
			
		}

		public void error(Marker marker, String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		public void error(Marker marker, String format, Object arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		public void error(Marker marker, String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		public void error(Marker marker, String msg, Throwable t) {
			// TODO Auto-generated method stub
			
		}
    }
  
}
