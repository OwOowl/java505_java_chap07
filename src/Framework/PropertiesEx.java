package Framework;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws Exception{
//        Properties : 키와 값을 String 타입으로 제한한 Map 컬렉션. 프로퍼티(~.properties) 파일을 읽어 들일 때 주로 사용
        Properties properties = new Properties();
        String path = PropertiesEx.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
//        System.out.println("파일 경로 : " + path);
//        파일의 내용을 읽어옴
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
