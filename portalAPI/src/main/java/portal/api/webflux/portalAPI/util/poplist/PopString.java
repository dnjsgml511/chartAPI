package portal.api.webflux.portalAPI.util.poplist;

import java.util.List;

/**
 * 
 * VO���� String Ÿ�� ����Ʈ�� ����
 * 
 * @since 2021.06.13
 * @author dnjsg
 *
 */

public class PopString extends PopVO implements PopListInterface {

	@Override
	public List<?> type(List<?> list, String name) throws Exception {
		
		@SuppressWarnings("unchecked")
		List<? extends String> newList = (List<? extends String>) popvo(list, name);

		return newList;
	}
}
