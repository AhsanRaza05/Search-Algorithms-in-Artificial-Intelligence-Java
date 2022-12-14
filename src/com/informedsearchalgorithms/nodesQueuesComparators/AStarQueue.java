package com.informedsearchalgorithms.nodesQueuesComparators;

public class AStarQueue extends GBFSQueue{

	private Integer finalCost;
	
	public AStarQueue(int cost, HeuristicWeightedNode[] path, int heuristicCost) {
		
		super(cost, path, heuristicCost);
		
		this.finalCost = cost + heuristicCost;
		
	}

	public Integer getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(Integer finalCost) {
		this.finalCost = finalCost;
	}
	
	public String toString(){

		String path = super.toString();
		        
        path += ", Final Cost = %s".formatted(this.finalCost);

        return path;
    }


}
