package com.chemaxon.beetle.graphqlprototype;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.leangen.graphql.annotations.GraphQLQuery;
import model_original.Parent;

public class QueryResolver implements GraphQLQueryResolver {


	@GraphQLQuery(name = "parent")
	public List<Parent> allParents() {
		return Parent.allParents();
	}

}
