package com.example.demo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XkjcZbxGcdYjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XkjcZbxGcdYjExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBhIsNull() {
            addCriterion("bh is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("bh is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(Integer value) {
            addCriterion("bh =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(Integer value) {
            addCriterion("bh <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(Integer value) {
            addCriterion("bh >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(Integer value) {
            addCriterion("bh >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(Integer value) {
            addCriterion("bh <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(Integer value) {
            addCriterion("bh <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<Integer> values) {
            addCriterion("bh in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<Integer> values) {
            addCriterion("bh not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(Integer value1, Integer value2) {
            addCriterion("bh between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(Integer value1, Integer value2) {
            addCriterion("bh not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcIsNull() {
            addCriterion("yj_gcd_mc is null");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcIsNotNull() {
            addCriterion("yj_gcd_mc is not null");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcEqualTo(String value) {
            addCriterion("yj_gcd_mc =", value, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcNotEqualTo(String value) {
            addCriterion("yj_gcd_mc <>", value, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcGreaterThan(String value) {
            addCriterion("yj_gcd_mc >", value, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcGreaterThanOrEqualTo(String value) {
            addCriterion("yj_gcd_mc >=", value, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcLessThan(String value) {
            addCriterion("yj_gcd_mc <", value, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcLessThanOrEqualTo(String value) {
            addCriterion("yj_gcd_mc <=", value, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcLike(String value) {
            addCriterion("yj_gcd_mc like", value, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcNotLike(String value) {
            addCriterion("yj_gcd_mc not like", value, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcIn(List<String> values) {
            addCriterion("yj_gcd_mc in", values, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcNotIn(List<String> values) {
            addCriterion("yj_gcd_mc not in", values, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcBetween(String value1, String value2) {
            addCriterion("yj_gcd_mc between", value1, value2, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andYjGcdMcNotBetween(String value1, String value2) {
            addCriterion("yj_gcd_mc not between", value1, value2, "yjGcdMc");
            return (Criteria) this;
        }

        public Criteria andZbxBhIsNull() {
            addCriterion("zbx_bh is null");
            return (Criteria) this;
        }

        public Criteria andZbxBhIsNotNull() {
            addCriterion("zbx_bh is not null");
            return (Criteria) this;
        }

        public Criteria andZbxBhEqualTo(String value) {
            addCriterion("zbx_bh =", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhNotEqualTo(String value) {
            addCriterion("zbx_bh <>", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhGreaterThan(String value) {
            addCriterion("zbx_bh >", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhGreaterThanOrEqualTo(String value) {
            addCriterion("zbx_bh >=", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhLessThan(String value) {
            addCriterion("zbx_bh <", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhLessThanOrEqualTo(String value) {
            addCriterion("zbx_bh <=", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhLike(String value) {
            addCriterion("zbx_bh like", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhNotLike(String value) {
            addCriterion("zbx_bh not like", value, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhIn(List<String> values) {
            addCriterion("zbx_bh in", values, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhNotIn(List<String> values) {
            addCriterion("zbx_bh not in", values, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhBetween(String value1, String value2) {
            addCriterion("zbx_bh between", value1, value2, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxBhNotBetween(String value1, String value2) {
            addCriterion("zbx_bh not between", value1, value2, "zbxBh");
            return (Criteria) this;
        }

        public Criteria andZbxMcIsNull() {
            addCriterion("zbx_mc is null");
            return (Criteria) this;
        }

        public Criteria andZbxMcIsNotNull() {
            addCriterion("zbx_mc is not null");
            return (Criteria) this;
        }

        public Criteria andZbxMcEqualTo(String value) {
            addCriterion("zbx_mc =", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcNotEqualTo(String value) {
            addCriterion("zbx_mc <>", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcGreaterThan(String value) {
            addCriterion("zbx_mc >", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcGreaterThanOrEqualTo(String value) {
            addCriterion("zbx_mc >=", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcLessThan(String value) {
            addCriterion("zbx_mc <", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcLessThanOrEqualTo(String value) {
            addCriterion("zbx_mc <=", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcLike(String value) {
            addCriterion("zbx_mc like", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcNotLike(String value) {
            addCriterion("zbx_mc not like", value, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcIn(List<String> values) {
            addCriterion("zbx_mc in", values, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcNotIn(List<String> values) {
            addCriterion("zbx_mc not in", values, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcBetween(String value1, String value2) {
            addCriterion("zbx_mc between", value1, value2, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andZbxMcNotBetween(String value1, String value2) {
            addCriterion("zbx_mc not between", value1, value2, "zbxMc");
            return (Criteria) this;
        }

        public Criteria andGcdBhIsNull() {
            addCriterion("gcd_bh is null");
            return (Criteria) this;
        }

        public Criteria andGcdBhIsNotNull() {
            addCriterion("gcd_bh is not null");
            return (Criteria) this;
        }

        public Criteria andGcdBhEqualTo(String value) {
            addCriterion("gcd_bh =", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhNotEqualTo(String value) {
            addCriterion("gcd_bh <>", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhGreaterThan(String value) {
            addCriterion("gcd_bh >", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhGreaterThanOrEqualTo(String value) {
            addCriterion("gcd_bh >=", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhLessThan(String value) {
            addCriterion("gcd_bh <", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhLessThanOrEqualTo(String value) {
            addCriterion("gcd_bh <=", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhLike(String value) {
            addCriterion("gcd_bh like", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhNotLike(String value) {
            addCriterion("gcd_bh not like", value, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhIn(List<String> values) {
            addCriterion("gcd_bh in", values, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhNotIn(List<String> values) {
            addCriterion("gcd_bh not in", values, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhBetween(String value1, String value2) {
            addCriterion("gcd_bh between", value1, value2, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdBhNotBetween(String value1, String value2) {
            addCriterion("gcd_bh not between", value1, value2, "gcdBh");
            return (Criteria) this;
        }

        public Criteria andGcdMcIsNull() {
            addCriterion("gcd_mc is null");
            return (Criteria) this;
        }

        public Criteria andGcdMcIsNotNull() {
            addCriterion("gcd_mc is not null");
            return (Criteria) this;
        }

        public Criteria andGcdMcEqualTo(String value) {
            addCriterion("gcd_mc =", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcNotEqualTo(String value) {
            addCriterion("gcd_mc <>", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcGreaterThan(String value) {
            addCriterion("gcd_mc >", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcGreaterThanOrEqualTo(String value) {
            addCriterion("gcd_mc >=", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcLessThan(String value) {
            addCriterion("gcd_mc <", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcLessThanOrEqualTo(String value) {
            addCriterion("gcd_mc <=", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcLike(String value) {
            addCriterion("gcd_mc like", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcNotLike(String value) {
            addCriterion("gcd_mc not like", value, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcIn(List<String> values) {
            addCriterion("gcd_mc in", values, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcNotIn(List<String> values) {
            addCriterion("gcd_mc not in", values, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcBetween(String value1, String value2) {
            addCriterion("gcd_mc between", value1, value2, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andGcdMcNotBetween(String value1, String value2) {
            addCriterion("gcd_mc not between", value1, value2, "gcdMc");
            return (Criteria) this;
        }

        public Criteria andFilterIsNull() {
            addCriterion("filter is null");
            return (Criteria) this;
        }

        public Criteria andFilterIsNotNull() {
            addCriterion("filter is not null");
            return (Criteria) this;
        }

        public Criteria andFilterEqualTo(String value) {
            addCriterion("filter =", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterNotEqualTo(String value) {
            addCriterion("filter <>", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterGreaterThan(String value) {
            addCriterion("filter >", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterGreaterThanOrEqualTo(String value) {
            addCriterion("filter >=", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterLessThan(String value) {
            addCriterion("filter <", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterLessThanOrEqualTo(String value) {
            addCriterion("filter <=", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterLike(String value) {
            addCriterion("filter like", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterNotLike(String value) {
            addCriterion("filter not like", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterIn(List<String> values) {
            addCriterion("filter in", values, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterNotIn(List<String> values) {
            addCriterion("filter not in", values, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterBetween(String value1, String value2) {
            addCriterion("filter between", value1, value2, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterNotBetween(String value1, String value2) {
            addCriterion("filter not between", value1, value2, "filter");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNull() {
            addCriterion("time_type is null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIsNotNull() {
            addCriterion("time_type is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTypeEqualTo(Integer value) {
            addCriterion("time_type =", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotEqualTo(Integer value) {
            addCriterion("time_type <>", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThan(Integer value) {
            addCriterion("time_type >", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_type >=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThan(Integer value) {
            addCriterion("time_type <", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("time_type <=", value, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeIn(List<Integer> values) {
            addCriterion("time_type in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotIn(List<Integer> values) {
            addCriterion("time_type not in", values, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeBetween(Integer value1, Integer value2) {
            addCriterion("time_type between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andTimeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("time_type not between", value1, value2, "timeType");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbIsNull() {
            addCriterion("attribute_name_in_db is null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbIsNotNull() {
            addCriterion("attribute_name_in_db is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbEqualTo(String value) {
            addCriterion("attribute_name_in_db =", value, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbNotEqualTo(String value) {
            addCriterion("attribute_name_in_db <>", value, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbGreaterThan(String value) {
            addCriterion("attribute_name_in_db >", value, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_name_in_db >=", value, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbLessThan(String value) {
            addCriterion("attribute_name_in_db <", value, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbLessThanOrEqualTo(String value) {
            addCriterion("attribute_name_in_db <=", value, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbLike(String value) {
            addCriterion("attribute_name_in_db like", value, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbNotLike(String value) {
            addCriterion("attribute_name_in_db not like", value, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbIn(List<String> values) {
            addCriterion("attribute_name_in_db in", values, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbNotIn(List<String> values) {
            addCriterion("attribute_name_in_db not in", values, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbBetween(String value1, String value2) {
            addCriterion("attribute_name_in_db between", value1, value2, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeNameInDbNotBetween(String value1, String value2) {
            addCriterion("attribute_name_in_db not between", value1, value2, "attributeNameInDb");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIsNull() {
            addCriterion("attribute_value is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIsNotNull() {
            addCriterion("attribute_value is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueEqualTo(String value) {
            addCriterion("attribute_value =", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNotEqualTo(String value) {
            addCriterion("attribute_value <>", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueGreaterThan(String value) {
            addCriterion("attribute_value >", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value >=", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueLessThan(String value) {
            addCriterion("attribute_value <", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueLessThanOrEqualTo(String value) {
            addCriterion("attribute_value <=", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueLike(String value) {
            addCriterion("attribute_value like", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNotLike(String value) {
            addCriterion("attribute_value not like", value, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIn(List<String> values) {
            addCriterion("attribute_value in", values, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNotIn(List<String> values) {
            addCriterion("attribute_value not in", values, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueBetween(String value1, String value2) {
            addCriterion("attribute_value between", value1, value2, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNotBetween(String value1, String value2) {
            addCriterion("attribute_value not between", value1, value2, "attributeValue");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}