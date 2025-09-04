package com.suraj.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OllamaChatController {
	
	private final ChatClient ollamaChatClient;

	
	@GetMapping("/ollama/chat")
	public String generateResponse(@RequestParam String message) {
		return ollamaChatClient.prompt().user(message).call().content();
	}
}
