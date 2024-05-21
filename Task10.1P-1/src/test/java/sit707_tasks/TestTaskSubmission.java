package sit707_tasks;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class TestTaskSubmission {
	@Test
    public void testGetFeedbackStatus() {
		TaskSubmission TaskSubmission = new TaskSubmission("Approved", Arrays.asList("Message 1", "Message 2"));
        assertEquals("Approved", TaskSubmission.getFeedbackStatus());
    }

    @Test
    public void testGetChatMessages() {
    	TaskSubmission inboxTask = new TaskSubmission("Approved", Arrays.asList("Message 1", "Message 2"));
    }
}

