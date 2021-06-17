package portal.api.webflux.portalAPI.util.poplist;

import java.util.List;

/**
 * 
 * VO���� Integer Ÿ�� ����Ʈ�� ����
 * 
 * @since 2021.06.13
 * @author dnjsg
 *
 */

public class PopInteger extends PopVO implements PopListInterface{

	@Override
	public List<?> type(List<?> list, String name) throws Exception {
		
		@SuppressWarnings("unchecked")
		List<? extends Integer> newList = (List<? extends Integer>) popvo(list, name);
		
		return newList;
	}

}
