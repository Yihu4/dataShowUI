package Utils;

/**
 * @author: Yihu4
 * @create: 2021-10-22 17:25
 */

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author: Yihu4
 * @create: 2021-08-31 11:35
 */
public class JdbcUtils {
    // 用于接收
    // 静态代码块的变量,只能赋值静态变量
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    private static PreparedStatement stmt =null;
    private static Connection conn =null;
    private static ResultSet rs =null;

    // 定义静态代码块
    static { //读取资源文m件，获取值。
        try {
            // 创建工具类
            Properties properties = new Properties();
            // 获取src路径下的文件的方式---> ClassLoader 类加载器
            ClassLoader classLoader = JdbcUtils.class.getClassLoader();
            // 通过类加载器k获取properties, 传给输入流
            InputStream in = classLoader.getResourceAsStream("jdbc.properties");
            // 把输入流, 传给 properties 工具类, 由 properties 工具中的方法获取数据
            properties.load(in);
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 初始化, 等同
    //  Class.forName("com.mysql.cj.jdbc.Driver");
    //  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data2102", "root", "root");
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }

    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static int insert_delete_update(String sql, Object... obj){
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                stmt.setObject(i+1,obj[i]);
            }
            return stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return 0;
    }
    // Object[] obj -->  Object... obj可变数组参数
}
