package mongotest;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Date;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;



/**
 * 
 * @Copyright to ShenZhen Sinosun Technology Co.,LTD 2016-2018
 * @Classname:
 * @Project: MSTP
 * @Package: 
 * @Description:mongoTest
 * @Author:Jiazhen.Ben
 * @Version: 
 * @Date�� 
 * @History��
 */
public class Main {

	public static void main(String[] args) {
		try {
			Mongo mongo=new Mongo("localhost", 27017);
			DB db=mongo.getDB("mymongo");
			GridFS fs=new GridFS(db);
//			File file=new File("�ջ�.jpg");
//			GridFSInputFile inputFile=fs.createFile(file);
//			inputFile.put("name", "�ջ�.jpg");
//			inputFile.put("date", new Date().getTime());
//			inputFile.save();
//			System.out.println(inputFile.getMD5());
//			DBObject query=new BasicDBObject("_id",new ObjectId("57061da15188ed42e947a686"));
			GridFSDBFile gridFSDBFile=fs.findOne("");
//			
//			System.out.println(gridFSDBFile.getFilename());
			mongo.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
