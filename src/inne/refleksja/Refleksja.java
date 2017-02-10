package inne.refleksja;

import java.lang.reflect.Method;

/**
 * Created by kkramarz on 09.12.16.
 */



    public class Refleksja {

        public static Object getSetters(String pathClassName) throws IllegalAccessException, InstantiationException {
            Class c = null;
            try {
                Class[] parameters;
               c = Class.forName(pathClassName);

                Method m[] = c.getMethods();
                System.out.println("###############################");

                for (int i = 0; i < m.length; i++)
                    if (m[i].getName().startsWith("set")){
                        parameters = m[i].getParameterTypes();
                        for(int j = 0; j<parameters.length; j++){
                            System.out.println(parameters[j]);
                           if(parameters[j].equals("class java.lang.String")) {
                               m[i].invoke("myDefaultValue");
                           }
                      //  System.out.println(m[i].getName());
                        }

                    }

            }
            catch (Throwable e) {
                System.err.println(e);
            }

            System.out.println("###############################");
            System.out.println("###############################");
            return c.newInstance();
        }

    }

