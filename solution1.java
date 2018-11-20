package com.graph;
 
import java.util.*;
 
public class Solution{
	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
	public void addNum(int num) {
		minHeap.add(num);
		maxHeap.add(minHeap.poll());//让数不管怎样加到了maxheap中		
		if(minHeap.size()<maxHeap.size()) {//maxHeap可能大1，反正拿一个给minHeap就平衡了
			minHeap.add(maxHeap.poll());
		}
	}
	public double findMedian() {
		if(minHeap.size()==maxHeap.size()) {
			return (minHeap.peek()+maxHeap.peek())/2.0;
		}else {
			return minHeap.peek();
		}
	}
	
}
