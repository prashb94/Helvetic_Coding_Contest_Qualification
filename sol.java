import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class sol {
	
	public static class Edge{
		String x;
		int weight;
		public Edge(String x, int weight){this.x = x; this.weight = weight;}
		public String getCity(){return x;}
		public int getWeight(){return weight;}
	}
	
	public static Edge getMinimumCost(ArrayList<Edge> listOfEdges){
	    int min = 999; 
	    int pos = 0 ;
		for(int i = 0; i < listOfEdges.size(); i++)
		{
	    	 if(listOfEdges.get(i).getWeight() < min)
	    		 {
	    		 min = listOfEdges.get(i).getWeight();
	    		 pos = i;
	    		 }
	    }
	return listOfEdges.get(pos);
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("full.txt"));
        MultiValueMap<String, Edge> graph = new MultiValueMap<String, Edge>();;
        String line;
        while ((line = br.readLine()) != null) {
            String[] edgestr = line.split(Pattern.quote("->"));
            String[] costs = edgestr[1].split(":");
            Edge tempObj = new Edge(costs[0].replaceAll("\\s","").replaceAll("ü", "u"), Integer.parseInt(costs[1].replaceAll("\\s","")));
            graph.put(edgestr[0].replaceAll("\\s","").replaceAll("ü", "u"), tempObj);
        }
        int totalCost = 0;
        ArrayList<Edge> coll = (ArrayList<Edge>) graph.get("Lausanne");
        Edge first = getMinimumCost(coll);
        totalCost += first.getWeight();
        String tempCity = first.getCity();
        for(int i = 0; i < 100; i++)
        {
        Edge temp = getMinimumCost((ArrayList<Edge>) graph.get(tempCity));
        tempCity = temp.getCity();
        totalCost += temp.getWeight();
        System.out.println("City = " + tempCity + " totalCost so far = " + totalCost);
        }
    }
}
