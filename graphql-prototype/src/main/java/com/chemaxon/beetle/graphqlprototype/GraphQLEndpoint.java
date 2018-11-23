package com.chemaxon.beetle.graphqlprototype;

import java.io.IOException;

import graphql.servlet.DefaultGraphQLSchemaProvider;
import graphql.servlet.GraphQLInvocationInputFactory;
import graphql.servlet.GraphQLSchemaProvider;
import graphql.servlet.SimpleGraphQLHttpServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coxautodev.graphql.tools.SchemaParser;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends HttpServlet {

	private static final long serialVersionUID = 1L;
	SimpleGraphQLHttpServlet s = null;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		s.service(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		s.service(request, response);
	}

	public GraphQLEndpoint() {

		GraphQLSchemaProvider schemaProvider = new DefaultGraphQLSchemaProvider(
				SchemaParser.newParser().file("schema.graphqls")
						.resolvers(new QueryResolver())
						.build()
						.makeExecutableSchema());
		GraphQLInvocationInputFactory invocationInputFactory = GraphQLInvocationInputFactory
				.newBuilder(schemaProvider).build();
		s = SimpleGraphQLHttpServlet.newBuilder(invocationInputFactory).build();
	}

}