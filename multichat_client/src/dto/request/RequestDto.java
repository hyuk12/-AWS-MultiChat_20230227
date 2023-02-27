package dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RequestDto<T> {
	private String resource;
	private T body;
}
