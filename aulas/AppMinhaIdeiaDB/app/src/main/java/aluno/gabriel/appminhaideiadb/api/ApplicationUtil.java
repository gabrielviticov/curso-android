package aluno.gabriel.appminhaideiadb.api;

import aluno.gabriel.appminhaideiadb.BuildConfig;

public class ApplicationUtil {
    public static final String TAG = "@AppMinhaIdeiaDB";

    public String getApplicationVersion(){
        return BuildConfig.VERSION_NAME;
    }
}
