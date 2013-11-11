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
	 * 7. Number of samples for estimation
	 */
	
	 long total;
	 long dup;	
	 double R;
	 long size;
	 double dedupR;
	 double dedupE;
	 int estN;
	 
	 Node(){
		 
	 }
	 
	 Node(long total, long dup, double R, long size, double dedupR, double dedupE,int estN){
		 this.total = total;
		 this.dup = dup;
		 this.R = R;
		 this.size = size;
		 this.dedupR = dedupR;
		 this.dedupE = dedupE;
		 this.estN = estN;
	 }

}
