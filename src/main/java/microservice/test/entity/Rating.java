package microservice.test.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rating {
	
	private Long id;
	private Long userId;
	private Long hotelId;
	private int rating;
	private String feedback;
	

}
