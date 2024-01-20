package edu.baylor.csgroup.automation_timeline;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Theme(value = "hilla-tailwind")
public class AutomationTimelineApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(AutomationTimelineApplication.class, args);
	}

}
