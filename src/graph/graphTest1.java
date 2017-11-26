package graph;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class graphTest1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testQueryBridgeWords() {
		
		graph G =new graph();
		G.createDirectedGraph("C:\\Users\\huangxinchi\\Desktop\\lab6\\lab1\\PPAP.txt");
		String result=G.queryBridgeWords(G, "a", "to");
		System.out.println(result);
		assertEquals("No\"a\"exist in the graph",G.queryBridgeWords(G,"a","to"));
		assertEquals("No\"world\" exist in the graph",G.queryBridgeWords(G,"to","world"));
		assertEquals("No\"i\" and \"a\"exist in the graph",G.queryBridgeWords(G,"I","a"));
		assertEquals("No bridge words from \"to\"to \"worlds\"!",G.queryBridgeWords(G,"to","worlds"));
		assertEquals("The bridge words from \"to\"to \"out\"is: \"seek",G.queryBridgeWords(G,"to","out"));
		assertEquals("The bridge words from \"explore\"to \"new\"are: strange and odinary!",G.queryBridgeWords(G,"explore","new"));
	}

}
