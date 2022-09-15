package aluno.gabriel.aula002.core;

import aluno.gabriel.aula002.BuildConfig;

public class ApplicationUtil {
    public static final String TAG = "@aula003";    //static: concede a permissão de não precisar instanciar.   final: nunca vai mudar
    public static String applicationVersion(){
        return BuildConfig.VERSION_NAME;
    }
}
