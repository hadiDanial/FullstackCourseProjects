package org.tsofen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.tsofen.beans.Diploma;

@Configuration
@ComponentScan("org.tsofen") // Searches for Components in this package and its children
public class SpringConfigurations
{
	@Bean
	@Primary
	public Diploma createDiplmoa()
	{
		return new Diploma("Veterinarian Diploma", 2000);
	}
}
