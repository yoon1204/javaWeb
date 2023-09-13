package prj0824;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Book {
	String title;
	String author;
	int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author,int price) {
		this.title= title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "title : "+ title+" ,author : "+ author+ ",price : "+price; 
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
