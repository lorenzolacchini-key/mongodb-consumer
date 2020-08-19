package com.example.mongodbconsumer.msgController;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.mongodbconsumer.model.BookClass;
import com.example.mongodbconsumer.repository.BookRepository;

@Component
public class messageController {
	
	@Autowired
	private BookRepository repository;
	
	@RabbitListener(queues="${springexample.rabbitmq.queue}")
	public void receivedMessage(String msg) {
		
		String id="";
		String name="";
		String author="";
		String ora="";
		
		for (int i=0; i< msg.length(); i++) {
			if(msg.charAt(i)=='"') {
				i++;
				while(msg.charAt(i)!='"') {
					id=id+""+msg.charAt(i);
					i++;
				}
				i=i+3;
				while(msg.charAt(i)!='"') {
					name=name+""+msg.charAt(i);
					i++;
				}
				i=i+3;
				while(msg.charAt(i)!='"') {
					author=author+""+msg.charAt(i);
					i++;
				}
				i++;
				if(msg.charAt(i)!='.') break;
			}
		}
		
		System.out.println("ID: "+id+" Name: "+name+" Author: "+author);
		BookClass book = new BookClass(id, name, author);
		System.out.println("IDBOOK:" + book.getId());
		
		repository.save(book);
	}
	
}
