import { NgspringTemplatePage } from './app.po';

describe('ngspring-template App', () => {
  let page: NgspringTemplatePage;

  beforeEach(() => {
    page = new NgspringTemplatePage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
