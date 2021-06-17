package portal.api.webflux.portalAPI.chart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portal.api.webflux.portalAPI.chart.repository.DataRepositorySupport;
import portal.api.webflux.portalAPI.chart.vo.DataVO;
import portal.api.webflux.portalAPI.entity.Randomdata1;
import portal.api.webflux.portalAPI.util.poplist.PopInteger;
import portal.api.webflux.portalAPI.util.poplist.PopList;
import reactor.core.publisher.Flux;

@Service(value = "dataServiceImpl")
public class DataServiceImpl implements DataService {

	@Autowired
	private DataRepositorySupport rep;

	PopList poplist = new PopList();

	@Override
	public Flux<List<?>> findByData1(DataVO vo) throws Exception {

		List<Randomdata1> list = rep.findByData1(vo);
		Flux<List<? extends Object>> flux = Flux.just(
				poplist.popList(new PopInteger(), list, "data1"), 
				poplist.popList(new PopInteger(), list, "data2")
			);

		return flux;
	}
}
