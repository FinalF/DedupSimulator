import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class storageTest {

	static Map<String,Long> cache = new HashMap<String, Long>();
	static Map<String, long[]> index = new HashMap<String, long[]>();
	static String storageFileFolder = "testData/storageFolder";
	static long containerNo;
	static  int chunkSize = 8; //KB
	static  int segSize = 16; //MB
	static  long chunkNum;
	static  int[] sampledRecord = {0,0,0,0,0,0,0,0,0,1};
	static  int[] uniqueRecord = {0,0,0,0,0,0,0,0,1,1};

	static  File sampledHash = new File("testData/testFolder/storageInput/sampledHas");;
	
	
	public static void main(String args[]) throws IOException{
		storage_v2 storage = new storage_v2(index,cache,storageFileFolder,chunkSize,segSize,
				uniqueRecord,sampledRecord,sampledHash);
		
//		for(int i = 0; i<uniqueRecord.length;i++){
//		System.out.print(uniqueRecord[i] +" ");
//		}
		storage.storageWrite();
		storage.storageLoad();
		System.out.println("the current entry size: " + index.size());
		long[] meta = index.get("68c01fbbc925e1ba9d0d717a548baa3f6afa7766");  
	       System.out.println("The hitting count is: " + meta[0]); 
	       System.out.println("The container No. is: " + meta[1]); 
	       
	    storage.storageLoad((long)1);
	    long containerNo = cache.get("68c01fbbc925e1ba9d0d717a548baa3f6afa7766");  
	       System.out.println("The containerNo is: " + containerNo); 
	}
	

}
