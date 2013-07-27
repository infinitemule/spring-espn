/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.now;


/**
 * 
 *
 */
public interface NowApiService {

  public NowApiResponse latest();
  public NowApiResponse latest(Integer limit);
  public NowApiResponse latest(Integer limit, Integer offset);
  
  public NowApiResponse top();
  public NowApiResponse top(Integer limit);
  public NowApiResponse top(Integer limit, Integer offset);
  
  public NowApiResponse popular();
  public NowApiResponse popular(Integer limit);
  public NowApiResponse popular(Integer limit, Integer offset);
  
  public NowApiResponse call(NowApiRequest request);
  
}
