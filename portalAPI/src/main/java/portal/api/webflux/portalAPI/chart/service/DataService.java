package portal.api.webflux.portalAPI.chart.service;

import java.util.List;

import portal.api.webflux.portalAPI.chart.vo.DataVO;
import reactor.core.publisher.Flux;

public interface DataService {
	public Flux<List<?>>  findByData1(DataVO vo) throws Exception;
}
