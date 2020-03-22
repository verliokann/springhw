package springhw.scanbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("idTopic")
public class Topic {
	List<ITopicPart> tpl =  new ArrayList<ITopicPart>();

	@Autowired
	public Topic(List<ITopicPart> tpl) {
		super();
		this.tpl = tpl;
    }

	@Override
	public String toString() {
		return "Topic [tpl=" + tpl + "]";
	}
	  
}
