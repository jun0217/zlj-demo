package com.example.demo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XkjcEaryWarningConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XkjcEaryWarningConfigExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDependsOnIsNull() {
            addCriterion("depends_on is null");
            return (Criteria) this;
        }

        public Criteria andDependsOnIsNotNull() {
            addCriterion("depends_on is not null");
            return (Criteria) this;
        }

        public Criteria andDependsOnEqualTo(String value) {
            addCriterion("depends_on =", value, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnNotEqualTo(String value) {
            addCriterion("depends_on <>", value, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnGreaterThan(String value) {
            addCriterion("depends_on >", value, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnGreaterThanOrEqualTo(String value) {
            addCriterion("depends_on >=", value, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnLessThan(String value) {
            addCriterion("depends_on <", value, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnLessThanOrEqualTo(String value) {
            addCriterion("depends_on <=", value, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnLike(String value) {
            addCriterion("depends_on like", value, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnNotLike(String value) {
            addCriterion("depends_on not like", value, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnIn(List<String> values) {
            addCriterion("depends_on in", values, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnNotIn(List<String> values) {
            addCriterion("depends_on not in", values, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnBetween(String value1, String value2) {
            addCriterion("depends_on between", value1, value2, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andDependsOnNotBetween(String value1, String value2) {
            addCriterion("depends_on not between", value1, value2, "dependsOn");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdIsNull() {
            addCriterion("metric_group_node_id is null");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdIsNotNull() {
            addCriterion("metric_group_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdEqualTo(Long value) {
            addCriterion("metric_group_node_id =", value, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdNotEqualTo(Long value) {
            addCriterion("metric_group_node_id <>", value, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdGreaterThan(Long value) {
            addCriterion("metric_group_node_id >", value, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_group_node_id >=", value, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdLessThan(Long value) {
            addCriterion("metric_group_node_id <", value, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("metric_group_node_id <=", value, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdIn(List<Long> values) {
            addCriterion("metric_group_node_id in", values, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdNotIn(List<Long> values) {
            addCriterion("metric_group_node_id not in", values, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdBetween(Long value1, Long value2) {
            addCriterion("metric_group_node_id between", value1, value2, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("metric_group_node_id not between", value1, value2, "metricGroupNodeId");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameIsNull() {
            addCriterion("metric_group_node_name is null");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameIsNotNull() {
            addCriterion("metric_group_node_name is not null");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameEqualTo(String value) {
            addCriterion("metric_group_node_name =", value, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameNotEqualTo(String value) {
            addCriterion("metric_group_node_name <>", value, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameGreaterThan(String value) {
            addCriterion("metric_group_node_name >", value, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("metric_group_node_name >=", value, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameLessThan(String value) {
            addCriterion("metric_group_node_name <", value, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameLessThanOrEqualTo(String value) {
            addCriterion("metric_group_node_name <=", value, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameLike(String value) {
            addCriterion("metric_group_node_name like", value, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameNotLike(String value) {
            addCriterion("metric_group_node_name not like", value, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameIn(List<String> values) {
            addCriterion("metric_group_node_name in", values, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameNotIn(List<String> values) {
            addCriterion("metric_group_node_name not in", values, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameBetween(String value1, String value2) {
            addCriterion("metric_group_node_name between", value1, value2, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricGroupNodeNameNotBetween(String value1, String value2) {
            addCriterion("metric_group_node_name not between", value1, value2, "metricGroupNodeName");
            return (Criteria) this;
        }

        public Criteria andMetricIdIsNull() {
            addCriterion("metric_id is null");
            return (Criteria) this;
        }

        public Criteria andMetricIdIsNotNull() {
            addCriterion("metric_id is not null");
            return (Criteria) this;
        }

        public Criteria andMetricIdEqualTo(String value) {
            addCriterion("metric_id =", value, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdNotEqualTo(String value) {
            addCriterion("metric_id <>", value, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdGreaterThan(String value) {
            addCriterion("metric_id >", value, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdGreaterThanOrEqualTo(String value) {
            addCriterion("metric_id >=", value, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdLessThan(String value) {
            addCriterion("metric_id <", value, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdLessThanOrEqualTo(String value) {
            addCriterion("metric_id <=", value, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdLike(String value) {
            addCriterion("metric_id like", value, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdNotLike(String value) {
            addCriterion("metric_id not like", value, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdIn(List<String> values) {
            addCriterion("metric_id in", values, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdNotIn(List<String> values) {
            addCriterion("metric_id not in", values, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdBetween(String value1, String value2) {
            addCriterion("metric_id between", value1, value2, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricIdNotBetween(String value1, String value2) {
            addCriterion("metric_id not between", value1, value2, "metricId");
            return (Criteria) this;
        }

        public Criteria andMetricNameIsNull() {
            addCriterion("metric_name is null");
            return (Criteria) this;
        }

        public Criteria andMetricNameIsNotNull() {
            addCriterion("metric_name is not null");
            return (Criteria) this;
        }

        public Criteria andMetricNameEqualTo(String value) {
            addCriterion("metric_name =", value, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameNotEqualTo(String value) {
            addCriterion("metric_name <>", value, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameGreaterThan(String value) {
            addCriterion("metric_name >", value, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameGreaterThanOrEqualTo(String value) {
            addCriterion("metric_name >=", value, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameLessThan(String value) {
            addCriterion("metric_name <", value, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameLessThanOrEqualTo(String value) {
            addCriterion("metric_name <=", value, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameLike(String value) {
            addCriterion("metric_name like", value, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameNotLike(String value) {
            addCriterion("metric_name not like", value, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameIn(List<String> values) {
            addCriterion("metric_name in", values, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameNotIn(List<String> values) {
            addCriterion("metric_name not in", values, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameBetween(String value1, String value2) {
            addCriterion("metric_name between", value1, value2, "metricName");
            return (Criteria) this;
        }

        public Criteria andMetricNameNotBetween(String value1, String value2) {
            addCriterion("metric_name not between", value1, value2, "metricName");
            return (Criteria) this;
        }

        public Criteria andNfIsNull() {
            addCriterion("nf is null");
            return (Criteria) this;
        }

        public Criteria andNfIsNotNull() {
            addCriterion("nf is not null");
            return (Criteria) this;
        }

        public Criteria andNfEqualTo(String value) {
            addCriterion("nf =", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotEqualTo(String value) {
            addCriterion("nf <>", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfGreaterThan(String value) {
            addCriterion("nf >", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfGreaterThanOrEqualTo(String value) {
            addCriterion("nf >=", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfLessThan(String value) {
            addCriterion("nf <", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfLessThanOrEqualTo(String value) {
            addCriterion("nf <=", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfLike(String value) {
            addCriterion("nf like", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotLike(String value) {
            addCriterion("nf not like", value, "nf");
            return (Criteria) this;
        }

        public Criteria andNfIn(List<String> values) {
            addCriterion("nf in", values, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotIn(List<String> values) {
            addCriterion("nf not in", values, "nf");
            return (Criteria) this;
        }

        public Criteria andNfBetween(String value1, String value2) {
            addCriterion("nf between", value1, value2, "nf");
            return (Criteria) this;
        }

        public Criteria andNfNotBetween(String value1, String value2) {
            addCriterion("nf not between", value1, value2, "nf");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodIsNull() {
            addCriterion("statistics_method is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodIsNotNull() {
            addCriterion("statistics_method is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodEqualTo(String value) {
            addCriterion("statistics_method =", value, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodNotEqualTo(String value) {
            addCriterion("statistics_method <>", value, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodGreaterThan(String value) {
            addCriterion("statistics_method >", value, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_method >=", value, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodLessThan(String value) {
            addCriterion("statistics_method <", value, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodLessThanOrEqualTo(String value) {
            addCriterion("statistics_method <=", value, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodLike(String value) {
            addCriterion("statistics_method like", value, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodNotLike(String value) {
            addCriterion("statistics_method not like", value, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodIn(List<String> values) {
            addCriterion("statistics_method in", values, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodNotIn(List<String> values) {
            addCriterion("statistics_method not in", values, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodBetween(String value1, String value2) {
            addCriterion("statistics_method between", value1, value2, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andStatisticsMethodNotBetween(String value1, String value2) {
            addCriterion("statistics_method not between", value1, value2, "statisticsMethod");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNull() {
            addCriterion("threshold is null");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNotNull() {
            addCriterion("threshold is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdEqualTo(String value) {
            addCriterion("threshold =", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotEqualTo(String value) {
            addCriterion("threshold <>", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThan(String value) {
            addCriterion("threshold >", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThanOrEqualTo(String value) {
            addCriterion("threshold >=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThan(String value) {
            addCriterion("threshold <", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThanOrEqualTo(String value) {
            addCriterion("threshold <=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLike(String value) {
            addCriterion("threshold like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotLike(String value) {
            addCriterion("threshold not like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdIn(List<String> values) {
            addCriterion("threshold in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotIn(List<String> values) {
            addCriterion("threshold not in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdBetween(String value1, String value2) {
            addCriterion("threshold between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotBetween(String value1, String value2) {
            addCriterion("threshold not between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIsNull() {
            addCriterion("warn_time is null");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIsNotNull() {
            addCriterion("warn_time is not null");
            return (Criteria) this;
        }

        public Criteria andWarnTimeEqualTo(Date value) {
            addCriterionForJDBCDate("warn_time =", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("warn_time <>", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("warn_time >", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("warn_time >=", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeLessThan(Date value) {
            addCriterionForJDBCDate("warn_time <", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("warn_time <=", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIn(List<Date> values) {
            addCriterionForJDBCDate("warn_time in", values, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("warn_time not in", values, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("warn_time between", value1, value2, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("warn_time not between", value1, value2, "warnTime");
            return (Criteria) this;
        }

        public Criteria andIsAlertIsNull() {
            addCriterion("is_alert is null");
            return (Criteria) this;
        }

        public Criteria andIsAlertIsNotNull() {
            addCriterion("is_alert is not null");
            return (Criteria) this;
        }

        public Criteria andIsAlertEqualTo(Integer value) {
            addCriterion("is_alert =", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertNotEqualTo(Integer value) {
            addCriterion("is_alert <>", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertGreaterThan(Integer value) {
            addCriterion("is_alert >", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_alert >=", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertLessThan(Integer value) {
            addCriterion("is_alert <", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertLessThanOrEqualTo(Integer value) {
            addCriterion("is_alert <=", value, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertIn(List<Integer> values) {
            addCriterion("is_alert in", values, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertNotIn(List<Integer> values) {
            addCriterion("is_alert not in", values, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertBetween(Integer value1, Integer value2) {
            addCriterion("is_alert between", value1, value2, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsAlertNotBetween(Integer value1, Integer value2) {
            addCriterion("is_alert not between", value1, value2, "isAlert");
            return (Criteria) this;
        }

        public Criteria andIsExistsIsNull() {
            addCriterion("is_exists is null");
            return (Criteria) this;
        }

        public Criteria andIsExistsIsNotNull() {
            addCriterion("is_exists is not null");
            return (Criteria) this;
        }

        public Criteria andIsExistsEqualTo(Integer value) {
            addCriterion("is_exists =", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsNotEqualTo(Integer value) {
            addCriterion("is_exists <>", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsGreaterThan(Integer value) {
            addCriterion("is_exists >", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_exists >=", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsLessThan(Integer value) {
            addCriterion("is_exists <", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsLessThanOrEqualTo(Integer value) {
            addCriterion("is_exists <=", value, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsIn(List<Integer> values) {
            addCriterion("is_exists in", values, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsNotIn(List<Integer> values) {
            addCriterion("is_exists not in", values, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsBetween(Integer value1, Integer value2) {
            addCriterion("is_exists between", value1, value2, "isExists");
            return (Criteria) this;
        }

        public Criteria andIsExistsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_exists not between", value1, value2, "isExists");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderIsNull() {
            addCriterion("yj_gcd_order is null");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderIsNotNull() {
            addCriterion("yj_gcd_order is not null");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderEqualTo(Integer value) {
            addCriterion("yj_gcd_order =", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderNotEqualTo(Integer value) {
            addCriterion("yj_gcd_order <>", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderGreaterThan(Integer value) {
            addCriterion("yj_gcd_order >", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("yj_gcd_order >=", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderLessThan(Integer value) {
            addCriterion("yj_gcd_order <", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderLessThanOrEqualTo(Integer value) {
            addCriterion("yj_gcd_order <=", value, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderIn(List<Integer> values) {
            addCriterion("yj_gcd_order in", values, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderNotIn(List<Integer> values) {
            addCriterion("yj_gcd_order not in", values, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderBetween(Integer value1, Integer value2) {
            addCriterion("yj_gcd_order between", value1, value2, "yjGcdOrder");
            return (Criteria) this;
        }

        public Criteria andYjGcdOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("yj_gcd_order not between", value1, value2, "yjGcdOrder");
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