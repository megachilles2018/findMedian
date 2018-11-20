public class Solution{
	List<Integer> list = new ArrayList<Integer>();
	
	//log
	public void addNum(int num){
		list.add(num);
		Collections.sort(list);
	}	
	
	public int findMedian(){
		int size = list.size();
		if(size==0) return null;
				
		if(size%2!=0){
			return list.get(size/2);
		}else{
			return (list.get(size/2)+list.get(size/2-1))/2;
		}
	}
}
