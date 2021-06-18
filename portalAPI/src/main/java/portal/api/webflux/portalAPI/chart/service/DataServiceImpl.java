package portal.api.webflux.portalAPI.chart.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portal.api.webflux.portalAPI.chart.repository.DataRepositorySupport;
import portal.api.webflux.portalAPI.chart.vo.DataVO;
import portal.api.webflux.portalAPI.entity.Randomdata1;
import portal.api.webflux.portalAPI.entity.Randomdata2;
import portal.api.webflux.portalAPI.util.poplist.PopInteger;
import portal.api.webflux.portalAPI.util.poplist.PopList;
import reactor.core.publisher.Flux;

@Service(value = "dataServiceImpl")
public class DataServiceImpl implements DataService {

	@Autowired
	private DataRepositorySupport rep;

	PopList poplist = new PopList();
	private final int count = 30;

	@Override
	public Flux<List<?>> findByData1(DataVO vo) throws Exception {

		List<Randomdata1> list = rep.findByData1(vo);
		Collections.reverse(list);
		List<Randomdata1> newList = new ArrayList<Randomdata1>();
		try {
			for (int i = 0; i < count; i++) {
				newList.add(list.get(i));
			}
		} catch (Exception e) {
		}

		Flux<List<? extends Object>> flux = Flux.just(poplist.popList(new PopInteger(), newList, "data1"),
				poplist.popList(new PopInteger(), newList, "data2"));

		return flux;
	}

	@Override
	public Flux<List<?>> findByData2(DataVO vo) throws Exception {

		List<Randomdata2> list = rep.findByData2(vo);
		Collections.reverse(list);
		List<Randomdata2> newList = new ArrayList<Randomdata2>();
		try {
			for (int i = 0; i < count; i++) {
				newList.add(list.get(i));
			}
		} catch (Exception e) {
		}

		Flux<List<? extends Object>> flux = Flux.just(poplist.popList(new PopInteger(), newList, "data1"),
				poplist.popList(new PopInteger(), newList, "data2"));

		return flux;
	}
}
