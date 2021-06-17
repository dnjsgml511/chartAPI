package portal.api.webflux.portalAPI.util.poplist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * VO값 추출 해 리턴
 * 
 * @since 2021.06.13
 * @author lwh
 *
 */
public class PopVO {

	public List<?> popvo(List<?> list, String name) throws Exception {

		List<Object> newList = new ArrayList<Object>();

		for (Object vo : list) {
			for (Field field : vo.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				Object value = field.get(vo);
				if(field.getName().equals(name)) {
					newList.add(value);
				}
			}
		}

		return newList;
	}
}
