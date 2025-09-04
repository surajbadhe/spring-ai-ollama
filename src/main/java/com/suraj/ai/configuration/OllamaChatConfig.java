package com.suraj.ai.configuration;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OllamaChatConfig {

	@Bean
	ChatClient ollamaChatClient(OllamaChatModel chatModel) {
		return ChatClient.builder(chatModel).build();
	}

//	@Bean
//	CommandLineRunner commandLineRunner(ChatClient ollamaChatClient) {
//		return args -> {
//			System.out.println("Prompting to Ollama - Tell me an interesting fact about Java");
//			var response = ollamaChatClient
//					.prompt("Tell me an interesting fact about Java in one line")
//					.call()
//					.content();
//
//			System.out.println(response);
//		};
//	}

}
