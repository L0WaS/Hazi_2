package hu.ulyssys.java.course.maven.service.impl;

import hu.ulyssys.java.course.maven.dao.PlaneDAO;
import hu.ulyssys.java.course.maven.entity.Plane;
import hu.ulyssys.java.course.maven.service.PlaneService;

import javax.ejb.Stateless;

@Stateless
public class PlaneServiceImpl extends AbstractOwnerServiceImpl<Plane> implements PlaneService {
}
