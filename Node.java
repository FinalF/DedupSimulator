/*
 * used to store statistic information
 */
public class Node {
	/*
	 * 1. The amount of data has been processes
	 * 2. The amount of duplicate data
	 * 3. Sampling rate
	 * 4. The index size
	 * 5. The dedup ratio
	 * 6. The dedup efficiency
	 */
	
	 long total;
	 long dup;	
	 double R;
	 long size;
	 double dedupR;
	 double dedupE;
	 
	 Node(){
		 
	 }
	 
	 Node(long total, long dup, double R, long size, double dedupR, double dedupE){
		 this.total = total;
		 this.dup = dup;
		 this.R = R;
		 this.size = size;
		 this.dedupR = dedupR;
		 this.dedupE = dedupE;
	 }

}
