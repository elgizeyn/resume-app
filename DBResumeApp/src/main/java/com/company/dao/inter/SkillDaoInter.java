package com.company.dao.inter;

import com.company.entity.Skill;
import java.util.List;

public interface SkillDaoInter {

    public List<Skill> getAllSkill();

    public boolean insertSkill(Skill s);
}
