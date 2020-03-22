package springhw.scanbeans;

import org.springframework.stereotype.Component;

@Component
public class TheoreticalPart implements ITopicPart {

	@Override
	public String getContent() {
		return "Содержание теоретической части";
	}

	@Override
	public String toString() {
		return "TheoreticalPart [getContent()=" + getContent() + "]";
	}

	
}
