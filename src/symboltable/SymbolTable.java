package symboltable;

import java.util.*;
import ast.definition.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String, Definition>> table;
	public SymbolTable()  {
		table = new ArrayList<Map<String, Definition>>();
		table.set(scope ,new HashMap<String, Definition>());
	}

	public void set() {

		scope++;
		table.set(scope ,new HashMap<String, Definition>());
	}
	
	public void reset() {


		table.remove(scope);
		scope--;
	}
	
	public boolean insert(Definition definition) {

		//If definition already exists
		if(find(definition.getName()) != null){
			return false;
		}

		table.get(scope).put(definition.getName(),definition);

		//If definition added correctly
		return find(definition.getName()) != null;


	}
	
	public Definition find(String id) {

		Definition found ;

		for(int localScope = table.size()-1; localScope >= 0; localScope--){

			found = table.get(localScope).get(id);
			if(found != null){
				return found;
			}
		}

		return null;

	}

	public Definition findInCurrentScope(String id) {
		return table.get(scope).get(id);

	}
}
