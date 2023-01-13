package FuramaResort.Service.Impl;

import FuramaResort.Model.FacilityModel;
import FuramaResort.Service.FacilityInterface;
import com.sun.jdi.Value;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FacilityServiceImpl implements FacilityInterface {
    Map<Objects, Value> mapList = new LinkedHashMap<>();

    @Override
    public List findAll() {
        return (List) mapList;
    }

    @Override
    public void create(Object o) {

    }

}
