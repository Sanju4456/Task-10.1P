package sit707_tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskSubmission {
	 private String feedbackStatus;
	    private List<String> chatMessages;

	    public TaskSubmission(String feedbackStatus, List<String> chatMessages) {
	        this.feedbackStatus = feedbackStatus;
	        this.chatMessages = chatMessages;
	    }

	    public String getFeedbackStatus() {
	        return feedbackStatus;
	    }

	    public List<String> getChatMessages() {
	        return chatMessages;
	    }}
