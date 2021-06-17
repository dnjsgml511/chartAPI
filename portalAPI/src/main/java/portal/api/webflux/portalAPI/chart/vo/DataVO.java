package portal.api.webflux.portalAPI.chart.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DataVO {
	private int idx;
	
	private int value;
	private String label;
	private int type;
	
	private String team;
	private String[] teams;
	private int year;
	private String prod;
	private int deep;
}
